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

Students don't need to memorize all 12 initially. Understand the key ideas:

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

Requirement Change → Backlog Update → Sprint Planning → Development → Testing → Demo → Feedback

5. Scrum
Scrum is a popular Agile framework.
Provides a structured way for teams to develop products.
Work is organized into Sprints.
Sprint is usually 1–4 weeks.
Each Sprint aims to produce a usable product Increment.
Scrum Flow

Product Backlog
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

Developers
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

As a customer, I want to add products to my cart so that I can purchase multiple products together.

Students Should Understand

User Story = Requirement + User Perspective + Business Value

9. Acceptance Criteria
Defines the conditions that a User Story must satisfy.
Helps developers understand expected behavior.
Helps testers create test cases.
Helps Product Owner determine whether the story meets expectations.
Example

User Story: Add product to cart.

Acceptance Criteria:

User can click Add to Cart.
Selected product appears in cart.
Product quantity can be updated.
Cart displays correct total price.
User receives an appropriate message when the product is unavailable.
10. Product Backlog vs Sprint Backlog
Product Backlog
Complete list of product requirements/work.
Managed and prioritized by Product Owner.
Can change as product needs change.
Sprint Backlog
Work selected for the current Sprint.
Developers use it to plan and track Sprint work.
Easy Way to Remember

Product Backlog = Everything

Sprint Backlog = Current Sprint Work

11. Jira – Corporate Tool Introduction

Jira is commonly used by Agile teams to manage and track software development work.

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
1. Distributed Version Control – Basics
Version Control System (VCS) helps developers track changes in source code.
Allows developers to:
Track code changes
Restore previous versions
Work on multiple features
Collaborate with other developers
Maintain project history
Distributed Version Control System (DVCS)
Every developer has a local copy of the repository.
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
Supports collaboration, pull requests, issues, code reviews, and CI/CD integrations.
Bitbucket
Platform for hosting Git repositories.
Commonly used with Atlassian tools, such as Jira.
Easy Way to Remember

Git = Version Control
GitHub/Bitbucket = Remote Repository & Collaboration Platform

3. Installing Git
Installation Steps
Download and install Git.
Verify installation.
Configure username.
Configure email.
Configure preferred editor if required.
Verify Installation
git --version

Example:

git version 2.x.x
4. Basic Git Configuration
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

5. Git Repository

A repository (repo) is a location where Git tracks project files and their history.

Two Types
Local Repository
Exists on developer's computer.
Remote Repository
Hosted on platforms such as GitHub or Bitbucket.
6. Creating a Local Repository

Navigate to the project directory:

cd my-project

Initialize Git:

git init

Git creates a hidden:

.git

directory.

Important

.git contains the information Git needs to track the repository and its history.

7. Common Git Commands
Command	Purpose
git --version	Check Git version
git config	Configure Git
git init	Create repository
git clone	Copy remote repository
git status	Check repository status
git add	Stage changes
git commit	Save changes to Git history
git log	View commit history
git diff	View changes
git branch	Manage branches
git switch	Switch branches
git merge	Merge branches
git pull	Get and integrate remote changes
git push	Upload local commits
git remote	Manage remote repositories
8. Basic Git Workflow

The most important workflow for beginners:

Modify Files
     ↓
git status
     ↓
git add
     ↓
Staging Area
     ↓
git commit
     ↓
Local Repository
     ↓
git push
     ↓
GitHub
Example
git status

Stage a file:

git add index.html

Or stage everything:

git add .

Commit:

git commit -m "Add login page"

Push:

git push
9. Git Status
git status

Shows:

Modified files
New files
Deleted files
Staged files
Current branch
Example
modified: login.html
modified: login.css
10. Git Add
git add filename

Moves changes to the Staging Area.

Example:

git add login.html

Stage all changes:

git add .
Remember

add = Prepare changes for commit

11. Git Commit
git commit -m "Add login functionality"
Creates a snapshot of staged changes.
Commit should have a meaningful message.
Good Commit
git commit -m "Add user registration API"
Avoid
git commit -m "changes"
12. Git Log

View commit history:

git log

Short version:

git log --oneline

Example:

a12bc34 Add login functionality
b45de67 Add registration page
c78ef90 Initial commit
13. Git Clone

Used to copy an existing remote repository to your local machine.

git clone <repository-url>

Example:

git clone https://github.com/user/project.git
Difference

git init

→ Create a new local repository.

git clone

→ Copy an existing repository.

14. Remote Repository

A remote repository is the online/shared version of the project.

Common platforms:

GitHub
Bitbucket
GitLab
Add Remote
git remote add origin <repository-url>

Check remote:

git remote -v
origin
Standard name given to the primary remote repository.
It is a name/alias, not a Git command.
15. Git Push & Pull
Push
git push origin main

Uploads local commits to the remote repository.

Think:

Push = Local → Remote

Pull
git pull origin main

Gets remote changes and integrates them into the current local branch.

Think:

Pull = Remote → Local

16. Git Branch – Basic Concept

A branch allows developers to work on a feature independently.

Example:

main
 │
 ├── feature/login
 │
 ├── feature/payment
 │
 └── bugfix/cart
Create Branch
git branch feature/login

Create and switch:

git switch -c feature/login

Switch branch:

git switch main
17. GitHub Account Setup – Demo
Objective

Create a GitHub account and connect a local Git project to GitHub.

Demo Flow
Install Git
    ↓
Create GitHub Account
    ↓
Configure Git
    ↓
Create GitHub Repository
    ↓
Create Local Project
    ↓
git init
    ↓
git add .
    ↓
git commit
    ↓
Connect Remote
    ↓
git push
    ↓
Verify Repository on GitHub
18. Demo – Configure Git with GitHub
Step 1 – Create GitHub Account
Open GitHub.
Create/sign in to an account.
Verify email if required.
Configure profile.
Step 2 – Create Repository

Example:

Repository Name:
student-git-demo

Choose appropriate visibility:

Public
Private
Step 3 – Create Local Project
mkdir student-git-demo
cd student-git-demo

Create a file:

README.md
Step 4 – Initialize Git
git init
Step 5 – Configure Git
git config --global user.name "Student Name"
git config --global user.email "student@example.com"
Step 6 – Check Status
git status
Step 7 – Stage Files
git add .
Step 8 – Commit
git commit -m "Initial commit"
Step 9 – Connect GitHub Repository
git remote add origin <repository-url>

Verify:

git remote -v
Step 10 – Push Code

For a repository using main:

git branch -M main
git push -u origin main

Students should then refresh the GitHub repository and verify that the files are visible.

19. Corporate Git Workflow

Students should understand this basic industry workflow:

Jira User Story
       ↓
Create Feature Branch
       ↓
Write Code
       ↓
git status
       ↓
git add
       ↓
git commit
       ↓
git push
       ↓
Pull Request
       ↓
Code Review
       ↓
Merge
       ↓
Testing / CI-CD
       ↓
Deployment
Important Connection

Agile/Scrum + Jira + Git + GitHub

Jira
 ↓
User Story
 ↓
Developer creates Git branch
 ↓
Developer writes code
 ↓
Git commit
 ↓
GitHub
 ↓
Pull Request
 ↓
Code Review
 ↓
Merge
20. Quick Revision
Concept	Easy Meaning
Git	Version control tool
GitHub	Git repository hosting & collaboration platform
Repository	Project + version history
Commit	Saved snapshot
Branch	Independent line of development
Remote	Online/shared repository
Push	Local → Remote
Pull	Remote → Local
Clone	Remote → New Local Repository
Stage	Prepare changes for commit
Pull Request	Request to review and merge changes
Must-Know Commands
git --version
git config
git init
git clone
git status
git add
git commit
git log
git branch
git switch
git remote
git pull
git push