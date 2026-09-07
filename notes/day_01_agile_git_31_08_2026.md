1. SDLC Overview - Training Notes

SDLC (Software Development Life Cycle) – 
it is process used to develop and maintain software.

Main stages:
Requirement
Analysis & Planning
Design
Development
Testing
Deployment or Run the application 
Maintenance

Different SDLC models:
Waterfall
Agile
Iterative
Spiral

Industry focus: Most modern software teams 
use Agile-based practices to handle changing 
requirements and frequent releases.
2. Agile Overview
Agile is an iterative and incremental approach to software development.
Development is divided into small, manageable releases.

Encourages:
Customer collaboration
Continuous feedback
Frequent delivery
Team collaboration
Adaptability
Continuous improvement
Agile focuses on delivering business value quickly.

Industry Example

Instead of building an entire e-commerce application for 6 months:

Sprint 1 → Login
Sprint 2 → Product Search
Sprint 3 → Shopping Cart
Sprint 4 → Payment

3. Agile Manifesto
4 Core Values

Individuals & interactions over processes & tools
Working software over comprehensive documentation
Customer collaboration over contract negotiation
Responding to change over following a plan

Training Takeaway

Agile = People + Collaboration + Working Software + Adaptability

4. 12 Agile Principles – High Level

Students don't need to memorize all 12 initially. 
Understand the key ideas:

Deliver software frequently.
Focus on customer satisfaction.
Accept changing requirements.
Encourage business and developer collaboration.
Build teams around motivated people.
Prefer effective communication.
Focus on working software.
Maintain a sustainable pace.
Maintain technical quality.
Keep solutions simple.
Encourage self-organizing teams.
Continuously improve.
Corporate Connection

These principles appear in day-to-day activities such as:

Requirement Change → 
Backlog Update → 
Sprint Planning → Development → Testing → Demo → Feedback

5. Scrum
Scrum is a popular Agile framework.
Provides a structured way for teams to develop products or software.
Work is organized into Sprints.
Sprint is usually 1–4 weeks.
Each Sprint aims to produce a usable product Increment.
Scrum Flow

Product Backlog (application features like login page, signup page,dashboard etc)
↓
Sprint Planning
↓
Sprint Execution
↓
Daily Scrum
↓
Sprint Review
↓
Retrospective
↓
Next Sprint

6. Scrum Roles
Product Owner
Represents business/customer needs.
Prioritizes Product Backlog.
Defines product requirements.
Maximizes business value.
Clarifies requirements for the team.

Think:
"What should we build?"

Scrum Master
Facilitates Scrum.
Helps the team follow Scrum practices.
Removes/helps resolve impediments.
Supports collaboration.
Promotes continuous improvement.

Think:
"How can the team work better?"

Developers or Scrum team 

Design and build the product.
Write code.
Test functionality.
Fix defects.
Collaborate with the team.
Deliver the product Increment.

Think:
"How do we build it?"

7. Scrum Events

Sprint Planning
Decide what to work on during the Sprint.
Define Sprint Goal.
Select Product Backlog items.
Discuss how the work will be completed.

Keyword: PLAN

Daily Scrum
Short daily synchronization.
Discuss progress toward Sprint Goal.
Identify impediments.
Adjust the work plan.

Keyword: SYNC

Sprint Review
Demonstrate completed work.
Get stakeholder/customer feedback.
Discuss future requirements.

Keyword: DEMO + FEEDBACK

Sprint Retrospective
Discuss team/process performance.
Identify what went well.
Identify problems.
Decide improvements.

Keyword: IMPROVE

8. User Stories
User Story represents a requirement from the user/business perspective.
Common format:

As a [user], I want [feature], so that [benefit].

Example

As a customer, I want to add products to my cart so that I 
can purchase multiple products together.

Students Should Understand

User Story = Requirement + User Perspective + Business Value

9. Acceptance Criteria
Defines the conditions that a User Story must satisfy.
Helps developers understand expected behavior.
Helps testers create test cases.
Helps Product Owner determine whether the story meets expectations.
Example

User Story: Add product to cart and place the order. 

Acceptance Criteria:

User can click Add to Cart.
Selected product appears in cart.
Product quantity can be updated.
Cart displays correct total price.
User receives an appropriate message when the product is unavailable.

10. Product Backlog vs Sprint Backlog
Product Backlog
Complete list of product requirements/work (features)
Managed and prioritized by Product Owner.
Can change as product needs change.

Sprint Backlog
Work selected for the current Sprint.
Developers use it to plan and track Sprint work.

Easy Way to Remember

Product Backlog = Everything for the whole project or module of the project 

Sprint Backlog = Current Sprint Work

11. Jira – Corporate Tool Introduction

Jira is commonly used by Agile teams to 
manage and track software development work.

Jira Concepts
Project
Product Backlog
Epic
User Story
Task
Bug
Sprint
Story Points
Scrum Board
Workflow
Typical Workflow

To Do → In Progress → Code Review → Testing → Done

12. Jira Demo – Sprint Planning
Practical Demonstration

Show students how a real team performs Sprint Planning in Jira.

Demo Steps
Open Jira Project
Navigate to Backlog
Review Product Backlog
Prioritize User Stories
Create Sprint
Select User Stories
Define Sprint Goal
Add Story Points
Break stories into Tasks
Start Sprint
Open Scrum Board
Move issues through workflow
Example

Sprint Goal:

Build basic user authentication functionality.

Stories:

User Registration – 5 points
User Login – 3 points
Forgot Password – 5 points

Tasks for Login:

Login UI
Login API
Database validation
Unit testing
Integration testing

13. Corporate Scenario
Example: E-Commerce Application

Business Requirement:

Customers should be able to purchase products online.

Product Backlog

User Registration
User Login
Product Search
Product Details
Shopping Cart
Payment
Order Tracking

Sprint 1

Sprint Goal:

Enable customers to register and log in.

Sprint Work

Registration

UI
API
Database
Testing

Login

UI
API
Authentication
Testing
Sprint Review
Demonstrate Registration
Demonstrate Login
Collect stakeholder feedback
Retrospective
What worked?
What didn't work?
What should we improve?
14. Key Industry Terminology

Students should become familiar with:

Agile
Scrum
Sprint
Product Owner
Scrum Master
Developer
Product Backlog
Sprint Backlog
User Story
Epic
Task
Bug
Acceptance Criteria
Definition of Done
Story Points
Sprint Goal
Increment
Scrum Board
Stakeholder
Retrospective
15. One-Minute Revision
SDLC
 ↓
Agile
 ↓
Scrum
 ↓
Product Backlog
 ↓
Sprint Planning
 ↓
Sprint
 ↓
Daily Scrum
 ↓
Development + Testing
 ↓
Sprint Review
 ↓
Retrospective
 ↓
Next Sprint

Git & GitHub – Training Notes

Distributed Version Control – Basics

Version Control System (VCS) helps developers track 
changes in source code.

Allows developers to:
Track code changes
Restore previous versions
Work on multiple features
Collaborate with other developers
Maintain project history

Distributed Version Control System (DVCS)

Every developer has a local copy of the repository(folder).
Developers can work and commit changes offline.
Each local repository contains project history.
Changes can later be synchronized with a remote repository.

Git
Git is a distributed version control system.
Created by Linus Torvalds.
Widely used for software development and team collaboration.

Simple Architecture

Developer A                  Developer B
     ↓                            ↓
 Local Git Repo               Local Git Repo
     ↓                            ↓
     └────────── GitHub ──────────┘
              Remote Repo

2. Git vs GitHub vs Bitbucket

Git
Version control software/tool.
Runs on the developer's computer.
Tracks code changes locally.

GitHub
Cloud-based platform for hosting Git repositories.
Supports collaboration, pull requests, issues, 
code reviews, and CI/CD integrations.
Bitbucket
Platform for hosting Git repositories.
Commonly used with Atlassian tools, such as Jira.

Easy Way to Remember

Git = Version Control
GitHub/Bitbucket = Remote Repository & Collaboration Platform
as well as other remote repository provider. 

3. Installing Git
Installation Steps

Download and install Git.
https://git-scm.com/install/windows

Verify installation.

Configure username.
Configure email.
Configure preferred editor if required.
Verify Installation

git --version

Example:

git version 2.x.x

to create local folder as repository please run the command as 
git init 

Basic Git Configuration

Configure Username
git config --global user.name "Your Name"

Configure Email
git config --global user.email "your@email.com"

View Configuration
git config --list



Check Specific Configuration

git config user.name
git config user.email

Why Configuration?

Git uses the configured identity to associate commits with the developer.










